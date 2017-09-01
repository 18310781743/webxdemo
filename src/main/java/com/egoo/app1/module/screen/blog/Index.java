package com.egoo.app1.module.screen.blog;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.citrus.turbine.Context;

/**
 * Created by fs_dev on 15-11-26.
 */
public class Index {
    public void execute(Context context) {
           context.put("name", "朱成才");
           List<String> strings = new ArrayList<String>();
           strings.add("aa");
           strings.add("bb");
           strings.add("cc");
           strings.add("dd");
           context.put("strings", strings);
           
    }
}
