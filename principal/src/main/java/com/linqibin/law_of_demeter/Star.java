package com.linqibin.law_of_demeter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 迪米特法则, 最少知道原则, 只和朋友交谈.
 * @author lqb
 * @date 2023/2/7
 */
@Data
@AllArgsConstructor
public class Star {

    private String name;


}
