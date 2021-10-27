package com.example.nmc.Remind.Main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.nmc.Remind.About.AboutActivity;
import com.example.nmc.Remind.AppDefault.AppDefaultActivity;
import com.example.nmc.Remind.R;
import com.example.nmc.Remind.Settings.SettingsActivity;

public class MainActivity extends AppDefaultActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        //ToolBar là phần mở rộng của ACtionBar: Toolbar nó là một View (ViewGroup), nên nó có thể khai báo trong Layout, nó có thể chứa các View khác để bạn
        // thoải mái tùy biến, nó có thể nằm ở vị trí tùy biến khác nhau trong Layout, có thể thực hiện các Animate dễ dàng, có thể chèn nhiều Toolbar trong một Active
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar(); //ActionBar (thanh hành động) điều hướng cấp ứng dụng và các mục tương tác khác (Icon ứng dụng,
                                                    // Nút mũi tên để quay lại cửa sổ cha, Tiêu đề, Những nút bấm chính cho Activity,
                                                   //Các thành phần điều hướng (ví dụ Navigation drawer))
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
        }
    }

    @Override
    protected int contentViewLayoutRes() {
        return R.layout.activity_main;
    } //trả về bố cục/nội dung

    @NonNull
    @Override
    protected Fragment createInitialFragment() {
        return MainFragment.newInstance();
    } //trả về/tạo các đối tượng phân mảnh mới

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    } //tạo các menu tùy chọn (Vị trí các mục trong menu tùy chọn của bạn xuất hiện trên màn hình tùy thuộc vào phiên bản mà bạn đã phát triển ứng dụng của mình)

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.aboutMeMenuItem:
                Intent i = new Intent(this, AboutActivity.class);
                startActivity(i);
                return true;
            case R.id.preferences:
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    } //boolean Trả về false để cho phép tiếp tục xử lý menu bình thường, true để sử dụng nó ở đây.
}


