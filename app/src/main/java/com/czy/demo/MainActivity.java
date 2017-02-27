package com.czy.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SideBar.OnChooseLetterChangedListener {

    private List<User> userList;

    private UserAdapter adapter;

    private LinearLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        HintSideBar hintSideBar = (HintSideBar) findViewById(R.id.hintSideBar);
        RecyclerView rv_userList = (RecyclerView) findViewById(R.id.rv_userList);
        hintSideBar.setOnChooseLetterChangedListener(this);
        manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv_userList.setLayoutManager(manager);
        userList = new ArrayList<>();
        adapter = new UserAdapter(this);
        initData();
        adapter.setData(userList);
        rv_userList.setAdapter(adapter);
    }

    @Override
    public void onChooseLetter(String s) {
        int i = adapter.getFirstPositionByChar(s.charAt(0));
        if (i == -1) {
            return;
        }
        manager.scrollToPositionWithOffset(i, 0);
    }

    @Override
    public void onNoChooseLetter() {

    }

    public void initData() {
        User user1 = new User("陈", "12345678");
        User user2 = new User("赵", "12345678");
        User user3 = new User("南", "12345678");
        User user4 = new User("司徒", "12345678");
        User user5 = new User("李", "12345678");
        User user6 = new User("Y", "12345678");
        User user7 = new User("C", "12345678");
        User user8 = new User("吴", "12345678");
        User user9 = new User("钱", "12345678");
        User user10 = new User("蔡", "12345678");
        User user11 = new User("许", "12345678");
        User user12 = new User("沈", "12345678");
        User user13 = new User("吴", "12345678");
        User user14 = new User("邑", "12345678");
        User user15 = new User("A", "12345678");
        User user16 = new User("#奇怪符号", "12345678");
        User user17 = new User("@神奇符号", "12345678");
        User user18 = new User("s", "12345678");
        User user19 = new User("孙", "12345678");
        User user20 = new User("周", "12345678");
        User user21 = new User("A郑", "12345678");
        User user22 = new User("王", "12345678");
        User user23 = new User("黄", "12345678");
        User user24 = new User("弟", "12345678");
        User user25 = new User("浩", "12345678");
        User user26 = new User("BA郑", "12345678");
        User user27 = new User("应", "12345678");
        User user28 = new User("徐", "12345678");
        User user29 = new User("刘", "12345678");
        User user30 = new User("弟", "12345678");
        User user31 = new User("浩", "12345678");
        User user32 = new User("胡", "12345678");
        User user33 = new User("胡", "12345678");
        User user34 = new User("修", "12345678");
        User user35 = new User("秀", "12345678");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);
        userList.add(user9);
        userList.add(user10);
        userList.add(user11);
        userList.add(user12);
        userList.add(user13);
        userList.add(user14);
        userList.add(user15);
        userList.add(user16);
        userList.add(user17);
        userList.add(user18);
        userList.add(user19);
        userList.add(user20);
        userList.add(user21);
        userList.add(user22);
        userList.add(user23);
        userList.add(user24);
        userList.add(user25);
        userList.add(user26);
        userList.add(user27);
        userList.add(user28);
        userList.add(user29);
        userList.add(user30);
        userList.add(user31);
        userList.add(user32);
        userList.add(user33);
        userList.add(user34);
        userList.add(user35);
        userList.add(user20);
        userList.add(user21);
        userList.add(user22);
        userList.add(user23);
        userList.add(user24);
        userList.add(user25);
        userList.add(user26);
        userList.add(user27);
        userList.add(user28);
        userList.add(user29);
        userList.add(user30);
        userList.add(user31);
        userList.add(user32);
        userList.add(user33);
        userList.add(user34);
        userList.add(user35);
        Collections.sort(userList);
    }

}
