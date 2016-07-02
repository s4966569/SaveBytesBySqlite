package com.csctek.sqlitedemo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btn_save,btn_read;
    private WebView wv;
    private List<OrderInfo> orderInfoList  =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_save= (Button) findViewById(R.id.btn_save);
        btn_read= (Button) findViewById(R.id.btn_read);
        wv= (WebView) findViewById(R.id.wv);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createData();
                saveInfo(orderInfoList);
            }
        });


        btn_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readInfo();
            }
        });

        wv.clearCache(true);
        wv.loadUrl("http://mall.dayou.com.cn:8080//promoImage/4a1328af1331cfa50001/SC00214250100004311_10001_4e4781ea47adb4830040/index.html");
    }

    private void createData(){
        for(int i=0;i<10;i++){
            OrderInfo orderInfo = new OrderInfo();
            orderInfo.setOrderId(i+"");
            orderInfo.setOrderName("Name"+i);
            orderInfoList.add(orderInfo);
        }
    }
    private void saveInfo(List<OrderInfo> list){
        if(list!=null && list.size()>0){
            DBHelper dbHelper = new DBHelper(this);
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            db.execSQL("delete from order_info");

            for(OrderInfo orderInfo:list){
                ContentValues contentValues = new ContentValues();
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream oos = new ObjectOutputStream(bos);
                    oos.writeObject(orderInfo);
                    oos.flush();
                    byte[] data = bos.toByteArray();
                    contentValues.put("info",data);
                    db.insert("order_info",null,contentValues);
                    oos.close();
                    bos.close();
                    Log.i("save",orderInfo.getOrderName());
                } catch (IOException e) {
                    e.printStackTrace();
                }catch (Exception ex){
                    db.close();
                }
            }
            db.close();
        }
        Toast.makeText(this,"存入"+list.size()+"条数据",Toast.LENGTH_SHORT).show();
    }

    private List<OrderInfo> readInfo(){
        List<OrderInfo> list  = new ArrayList<>();
        DBHelper dbHelper = new DBHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor;
        cursor=db.rawQuery("select * from order_info",null);
        while (cursor.moveToNext()){
                byte[] data = cursor.getBlob(cursor.getColumnIndex("info"));
            ByteArrayInputStream bis  =new ByteArrayInputStream(data);
            try {
                ObjectInputStream ois  = new ObjectInputStream(bis);
                OrderInfo orderInfo = (OrderInfo) ois.readObject();
                if(orderInfo!=null){
                    list.add(orderInfo);
                    Log.i("read",orderInfo.getOrderName());
                }
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            }catch (Exception ex){
                db.close();
                return null;
            }
            db.close();
        }
        Toast.makeText(this,"取出"+list.size()+"条数据",Toast.LENGTH_SHORT).show();
        return list;
    }
}
