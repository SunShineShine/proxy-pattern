// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   <generated>

package com.lixuelin.proxy;

import java.lang.reflect.InvocationTargetException;
import net.sf.cglib.core.Signature;
import net.sf.cglib.reflect.FastClass;

// Referenced classes of package com.lixuelin.cglib:
//            UserServiceImpl

public class UserServiceImpl$$FastClassByCGLIB$$cbe603a2 extends FastClass
{

    public int getIndex(Signature signature)
    {
        String s = signature.toString();
        s;
        s.hashCode();
        JVM INSTR lookupswitch 5: default 110
    //                   -1422568652: 60
    //                   1763245657: 70
    //                   1826985398: 80
    //                   1913648695: 90
    //                   1984935277: 100;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
        "add()V";
        equals();
        JVM INSTR ifeq 111;
           goto _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_111;
_L7:
        return 0;
_L3:
        "delete(I)V";
        equals();
        JVM INSTR ifeq 111;
           goto _L9 _L10
_L10:
        break MISSING_BLOCK_LABEL_111;
_L9:
        return 1;
_L4:
        "equals(Ljava/lang/Object;)Z";
        equals();
        JVM INSTR ifeq 111;
           goto _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_111;
_L11:
        return 2;
_L5:
        "toString()Ljava/lang/String;";
        equals();
        JVM INSTR ifeq 111;
           goto _L13 _L14
_L14:
        break MISSING_BLOCK_LABEL_111;
_L13:
        return 3;
_L6:
        "hashCode()I";
        equals();
        JVM INSTR ifeq 111;
           goto _L15 _L16
_L16:
        break MISSING_BLOCK_LABEL_111;
_L15:
        return 4;
_L1:
        JVM INSTR pop ;
        return -1;
    }

    public int getIndex(String s, Class aclass[])
    {
        s;
        aclass;
        JVM INSTR swap ;
        JVM INSTR dup ;
        hashCode();
        JVM INSTR lookupswitch 5: default 258
    //                   -1776922004: 56
    //                   -1335458389: 90
    //                   -1295482945: 140
    //                   96417: 188
    //                   147696667: 222;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
        "toString";
        equals();
        JVM INSTR ifeq 259;
           goto _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_262;
_L7:
        JVM INSTR dup ;
        JVM INSTR arraylength .length;
        JVM INSTR tableswitch 0 0: default 87
    //                   0 84;
           goto _L9 _L10
_L9:
        break MISSING_BLOCK_LABEL_262;
_L10:
        JVM INSTR pop ;
        return 3;
_L3:
        "delete";
        equals();
        JVM INSTR ifeq 259;
           goto _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_262;
_L11:
        JVM INSTR dup ;
        JVM INSTR arraylength .length;
        JVM INSTR tableswitch 1 1: default 137
    //                   1 120;
           goto _L13 _L14
_L13:
        break MISSING_BLOCK_LABEL_262;
_L14:
        JVM INSTR dup ;
        0;
        JVM INSTR aaload ;
        getName();
        "int";
        equals();
        JVM INSTR ifeq 262;
           goto _L15 _L16
_L16:
        break MISSING_BLOCK_LABEL_262;
_L15:
        JVM INSTR pop ;
        return 1;
_L4:
        "equals";
        equals();
        JVM INSTR ifeq 259;
           goto _L17 _L18
_L18:
        break MISSING_BLOCK_LABEL_262;
_L17:
        JVM INSTR dup ;
        JVM INSTR arraylength .length;
        JVM INSTR tableswitch 1 1: default 185
    //                   1 168;
           goto _L19 _L20
_L19:
        break MISSING_BLOCK_LABEL_262;
_L20:
        JVM INSTR dup ;
        0;
        JVM INSTR aaload ;
        getName();
        "java.lang.Object";
        equals();
        JVM INSTR ifeq 262;
           goto _L21 _L22
_L22:
        break MISSING_BLOCK_LABEL_262;
_L21:
        JVM INSTR pop ;
        return 2;
_L5:
        "add";
        equals();
        JVM INSTR ifeq 259;
           goto _L23 _L24
_L24:
        break MISSING_BLOCK_LABEL_262;
_L23:
        JVM INSTR dup ;
        JVM INSTR arraylength .length;
        JVM INSTR tableswitch 0 0: default 219
    //                   0 216;
           goto _L25 _L26
_L25:
        break MISSING_BLOCK_LABEL_262;
_L26:
        JVM INSTR pop ;
        return 0;
_L6:
        "hashCode";
        equals();
        JVM INSTR ifeq 259;
           goto _L27 _L28
_L28:
        break MISSING_BLOCK_LABEL_262;
_L27:
        JVM INSTR dup ;
        JVM INSTR arraylength .length;
        JVM INSTR tableswitch 0 0: default 255
    //                   0 252;
           goto _L29 _L30
_L29:
        break MISSING_BLOCK_LABEL_262;
_L30:
        JVM INSTR pop ;
        return 4;
_L1:
        JVM INSTR pop ;
        JVM INSTR pop ;
        return -1;
    }

    public int getIndex(Class aclass[])
    {
        aclass;
        aclass.length;
        JVM INSTR tableswitch 0 0: default 23
    //                   0 20;
           goto _L1 _L2
_L2:
        JVM INSTR pop ;
        return 0;
_L1:
        JVM INSTR pop ;
        return -1;
    }

    public Object invoke(int i, Object obj, Object aobj[])
        throws InvocationTargetException
    {
        (UserServiceImpl)obj;
        i;
        JVM INSTR tableswitch 0 4: default 90
    //                   0 40
    //                   1 45
    //                   2 59
    //                   3 74
    //                   4 78;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
        add();
        return null;
_L3:
        ((Number)aobj[0]).intValue();
        delete();
        return null;
_L4:
        aobj[0];
        equals();
        JVM INSTR new #79  <Class Boolean>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        Boolean();
        return;
_L5:
        toString();
        return;
_L6:
        hashCode();
        JVM INSTR new #86  <Class Integer>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        Integer();
        return;
        JVM INSTR new #63  <Class InvocationTargetException>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        InvocationTargetException();
        throw ;
_L1:
        throw new IllegalArgumentException("Cannot find matching method/constructor");
    }

    public Object newInstance(int i, Object aobj[])
        throws InvocationTargetException
    {
        JVM INSTR new #65  <Class UserServiceImpl>;
        JVM INSTR dup ;
        i;
        JVM INSTR tableswitch 0 0: default 28
    //                   0 24;
           goto _L1 _L2
_L2:
        UserServiceImpl();
        return;
        JVM INSTR new #63  <Class InvocationTargetException>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        InvocationTargetException();
        throw ;
_L1:
        throw new IllegalArgumentException("Cannot find matching method/constructor");
    }

    public int getMaxIndex()
    {
        return 4;
    }

    public UserServiceImpl$$FastClassByCGLIB$$cbe603a2(Class class1)
    {
        super(class1);
    }
}
