package com.link.code.util;


import com.link.code.entity.Node;

/**
 * @program: dubbo
 * @description:
 * @author: wufeng
 * @create: 2018-11-03 14:40
 **/
public class NodeUtil {

    public Node reverse(Node node){
        // 上一节点
        Node prev = null;
        // 当前节点
        Node now = node;
        while (now != null) {
            // 将当前节点的下一节点地址存储起来
            Node next = now.next;
            now.next = prev;
            prev = now;
            now = next;
        }
        return prev;
    }


}
