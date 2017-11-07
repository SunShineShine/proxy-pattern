// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   <generated>

package com.lixuelin.proxy;

import java.lang.reflect.Method;
import net.sf.cglib.core.ReflectUtils;
import net.sf.cglib.core.Signature;

// Referenced classes of package com.lixuelin.cglib:
//            UserServiceImpl

public class UserServiceImpl$$EnhancerByCGLIB$$e6a99d9a extends UserServiceImpl
    implements Factory
{

    static void CGLIB$STATICHOOK1()
    {
        Method amethod[];
        Method amethod1[];
        CGLIB$THREAD_CALLBACKS = new ThreadLocal();
        CGLIB$emptyArgs = new Object[0];
        Class class1 = Class.forName("com.lixuelin.cglib.UserServiceImpl$$EnhancerByCGLIB$$e6a99d9a");
        Class class2;
        amethod = ReflectUtils.findMethods(new String[] {
            "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;"
        }, (class2 = Class.forName("java.lang.Object")).getDeclaredMethods());
        Method[] _tmp = amethod;
        CGLIB$equals$2$Method = amethod[0];
        CGLIB$equals$2$Proxy = MethodProxy.create(class2, class1, "(Ljava/lang/Object;)Z", "equals", "CGLIB$equals$2");
        CGLIB$toString$3$Method = amethod[1];
        CGLIB$toString$3$Proxy = MethodProxy.create(class2, class1, "()Ljava/lang/String;", "toString", "CGLIB$toString$3");
        CGLIB$hashCode$4$Method = amethod[2];
        CGLIB$hashCode$4$Proxy = MethodProxy.create(class2, class1, "()I", "hashCode", "CGLIB$hashCode$4");
        CGLIB$clone$5$Method = amethod[3];
        CGLIB$clone$5$Proxy = MethodProxy.create(class2, class1, "()Ljava/lang/Object;", "clone", "CGLIB$clone$5");
        amethod1 = ReflectUtils.findMethods(new String[] {
            "add", "()V", "delete", "(I)V"
        }, (class2 = Class.forName("com.lixuelin.cglib.UserServiceImpl")).getDeclaredMethods());
        Method[] _tmp1 = amethod1;
        CGLIB$add$0$Method = amethod1[0];
        CGLIB$add$0$Proxy = MethodProxy.create(class2, class1, "()V", "add", "CGLIB$add$0");
        CGLIB$delete$1$Method = amethod1[1];
        CGLIB$delete$1$Proxy = MethodProxy.create(class2, class1, "(I)V", "delete", "CGLIB$delete$1");
    }

    final void CGLIB$add$0()
    {
        super.add();
    }

    public final void add()
    {
        CGLIB$CALLBACK_0;
        if(CGLIB$CALLBACK_0 != null) goto _L2; else goto _L1
_L1:
        JVM INSTR pop ;
        CGLIB$BIND_CALLBACKS(this);
        CGLIB$CALLBACK_0;
_L2:
        JVM INSTR dup ;
        JVM INSTR ifnull 37;
           goto _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_21;
_L4:
        break MISSING_BLOCK_LABEL_37;
        this;
        CGLIB$add$0$Method;
        CGLIB$emptyArgs;
        CGLIB$add$0$Proxy;
        intercept();
        return;
        super.add();
        return;
    }

    final void CGLIB$delete$1(int i)
    {
        super.delete(i);
    }

    public final void delete(int i)
    {
        CGLIB$CALLBACK_0;
        if(CGLIB$CALLBACK_0 != null) goto _L2; else goto _L1
_L1:
        JVM INSTR pop ;
        CGLIB$BIND_CALLBACKS(this);
        CGLIB$CALLBACK_0;
_L2:
        JVM INSTR dup ;
        JVM INSTR ifnull 50;
           goto _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_21;
_L4:
        break MISSING_BLOCK_LABEL_50;
        this;
        CGLIB$delete$1$Method;
        new Object[] {
            new Integer(i)
        };
        CGLIB$delete$1$Proxy;
        intercept();
        return;
        super.delete(i);
        return;
    }

    final boolean CGLIB$equals$2(Object obj)
    {
        return super.equals(obj);
    }

    public final boolean equals(Object obj)
    {
        CGLIB$CALLBACK_0;
        if(CGLIB$CALLBACK_0 != null) goto _L2; else goto _L1
_L1:
        JVM INSTR pop ;
        CGLIB$BIND_CALLBACKS(this);
        CGLIB$CALLBACK_0;
_L2:
        JVM INSTR dup ;
        JVM INSTR ifnull 57;
           goto _L3 _L4
_L3:
        this;
        CGLIB$equals$2$Method;
        new Object[] {
            obj
        };
        CGLIB$equals$2$Proxy;
        intercept();
        JVM INSTR dup ;
        JVM INSTR ifnonnull 50;
           goto _L5 _L6
_L5:
        JVM INSTR pop ;
        false;
          goto _L7
_L6:
        (Boolean);
        booleanValue();
_L7:
        return;
_L4:
        return super.equals(obj);
    }

    final String CGLIB$toString$3()
    {
        return super.toString();
    }

    public final String toString()
    {
        CGLIB$CALLBACK_0;
        if(CGLIB$CALLBACK_0 != null) goto _L2; else goto _L1
_L1:
        JVM INSTR pop ;
        CGLIB$BIND_CALLBACKS(this);
        CGLIB$CALLBACK_0;
_L2:
        JVM INSTR dup ;
        JVM INSTR ifnull 40;
           goto _L3 _L4
_L3:
        this;
        CGLIB$toString$3$Method;
        CGLIB$emptyArgs;
        CGLIB$toString$3$Proxy;
        intercept();
        (String);
        return;
_L4:
        return super.toString();
    }

    final int CGLIB$hashCode$4()
    {
        return super.hashCode();
    }

    public final int hashCode()
    {
        CGLIB$CALLBACK_0;
        if(CGLIB$CALLBACK_0 != null) goto _L2; else goto _L1
_L1:
        JVM INSTR pop ;
        CGLIB$BIND_CALLBACKS(this);
        CGLIB$CALLBACK_0;
_L2:
        JVM INSTR dup ;
        JVM INSTR ifnull 52;
           goto _L3 _L4
_L3:
        this;
        CGLIB$hashCode$4$Method;
        CGLIB$emptyArgs;
        CGLIB$hashCode$4$Proxy;
        intercept();
        JVM INSTR dup ;
        JVM INSTR ifnonnull 45;
           goto _L5 _L6
_L5:
        JVM INSTR pop ;
        0;
          goto _L7
_L6:
        (Number);
        intValue();
_L7:
        return;
_L4:
        return super.hashCode();
    }

    final Object CGLIB$clone$5()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    protected final Object clone()
        throws CloneNotSupportedException
    {
        CGLIB$CALLBACK_0;
        if(CGLIB$CALLBACK_0 != null) goto _L2; else goto _L1
_L1:
        JVM INSTR pop ;
        CGLIB$BIND_CALLBACKS(this);
        CGLIB$CALLBACK_0;
_L2:
        JVM INSTR dup ;
        JVM INSTR ifnull 37;
           goto _L3 _L4
_L3:
        this;
        CGLIB$clone$5$Method;
        CGLIB$emptyArgs;
        CGLIB$clone$5$Proxy;
        intercept();
        return;
_L4:
        return super.clone();
    }

    public static MethodProxy CGLIB$findMethodProxy(Signature signature)
    {
        String s = signature.toString();
        s;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 140
    //                   -1422568652: 68
    //                   -508378822: 80
    //                   1763245657: 92
    //                   1826985398: 104
    //                   1913648695: 116
    //                   1984935277: 128;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L2:
        "add()V";
        equals();
        JVM INSTR ifeq 141;
           goto _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_141;
_L8:
        return CGLIB$add$0$Proxy;
_L3:
        "clone()Ljava/lang/Object;";
        equals();
        JVM INSTR ifeq 141;
           goto _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_141;
_L10:
        return CGLIB$clone$5$Proxy;
_L4:
        "delete(I)V";
        equals();
        JVM INSTR ifeq 141;
           goto _L12 _L13
_L13:
        break MISSING_BLOCK_LABEL_141;
_L12:
        return CGLIB$delete$1$Proxy;
_L5:
        "equals(Ljava/lang/Object;)Z";
        equals();
        JVM INSTR ifeq 141;
           goto _L14 _L15
_L15:
        break MISSING_BLOCK_LABEL_141;
_L14:
        return CGLIB$equals$2$Proxy;
_L6:
        "toString()Ljava/lang/String;";
        equals();
        JVM INSTR ifeq 141;
           goto _L16 _L17
_L17:
        break MISSING_BLOCK_LABEL_141;
_L16:
        return CGLIB$toString$3$Proxy;
_L7:
        "hashCode()I";
        equals();
        JVM INSTR ifeq 141;
           goto _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_141;
_L18:
        return CGLIB$hashCode$4$Proxy;
_L1:
        JVM INSTR pop ;
        return null;
    }

    public static void CGLIB$SET_THREAD_CALLBACKS(Callback acallback[])
    {
        CGLIB$THREAD_CALLBACKS.set(acallback);
    }

    public static void CGLIB$SET_STATIC_CALLBACKS(Callback acallback[])
    {
        CGLIB$STATIC_CALLBACKS = acallback;
    }

    private static final void CGLIB$BIND_CALLBACKS(Object obj)
    {
        UserServiceImpl$$EnhancerByCGLIB$$e6a99d9a userserviceimpl$$enhancerbycglib$$e6a99d9a = (UserServiceImpl$$EnhancerByCGLIB$$e6a99d9a)obj;
        if(userserviceimpl$$enhancerbycglib$$e6a99d9a.CGLIB$BOUND) goto _L2; else goto _L1
_L1:
        Object obj1;
        userserviceimpl$$enhancerbycglib$$e6a99d9a.CGLIB$BOUND = true;
        obj1 = CGLIB$THREAD_CALLBACKS.get();
        obj1;
        if(obj1 != null) goto _L4; else goto _L3
_L3:
        JVM INSTR pop ;
        CGLIB$STATIC_CALLBACKS;
        if(CGLIB$STATIC_CALLBACKS != null) goto _L4; else goto _L5
_L5:
        JVM INSTR pop ;
          goto _L2
_L4:
        (Callback[]);
        userserviceimpl$$enhancerbycglib$$e6a99d9a;
        JVM INSTR swap ;
        0;
        JVM INSTR aaload ;
        (MethodInterceptor);
        CGLIB$CALLBACK_0;
_L2:
    }

    public Object newInstance(Callback acallback[])
    {
        CGLIB$SET_THREAD_CALLBACKS(acallback);
        CGLIB$SET_THREAD_CALLBACKS(null);
        return new UserServiceImpl$$EnhancerByCGLIB$$e6a99d9a();
    }

    public Object newInstance(Callback callback)
    {
        CGLIB$SET_THREAD_CALLBACKS(new Callback[] {
            callback
        });
        CGLIB$SET_THREAD_CALLBACKS(null);
        return new UserServiceImpl$$EnhancerByCGLIB$$e6a99d9a();
    }

    public Object newInstance(Class aclass[], Object aobj[], Callback acallback[])
    {
        CGLIB$SET_THREAD_CALLBACKS(acallback);
        JVM INSTR new #2   <Class UserServiceImpl$$EnhancerByCGLIB$$e6a99d9a>;
        JVM INSTR dup ;
        aclass;
        aclass.length;
        JVM INSTR tableswitch 0 0: default 35
    //                   0 28;
           goto _L1 _L2
_L2:
        JVM INSTR pop ;
        UserServiceImpl$$EnhancerByCGLIB$$e6a99d9a();
          goto _L3
_L1:
        JVM INSTR pop ;
        throw new IllegalArgumentException("Constructor not found");
_L3:
        CGLIB$SET_THREAD_CALLBACKS(null);
        return;
    }

    public Callback getCallback(int i)
    {
        CGLIB$BIND_CALLBACKS(this);
        this;
        i;
        JVM INSTR tableswitch 0 0: default 30
    //                   0 24;
           goto _L1 _L2
_L2:
        CGLIB$CALLBACK_0;
          goto _L3
_L1:
        JVM INSTR pop ;
        null;
_L3:
        return;
    }

    public void setCallback(int i, Callback callback)
    {
        switch(i)
        {
        case 0: // '\0'
            CGLIB$CALLBACK_0 = (MethodInterceptor)callback;
            break;
        }
    }

    public Callback[] getCallbacks()
    {
        CGLIB$BIND_CALLBACKS(this);
        this;
        return (new Callback[] {
            CGLIB$CALLBACK_0
        });
    }

    public void setCallbacks(Callback acallback[])
    {
        this;
        acallback;
        JVM INSTR dup2 ;
        0;
        JVM INSTR aaload ;
        (MethodInterceptor);
        CGLIB$CALLBACK_0;
    }

    private boolean CGLIB$BOUND;
    public static Object CGLIB$FACTORY_DATA;
    private static final ThreadLocal CGLIB$THREAD_CALLBACKS;
    private static final Callback CGLIB$STATIC_CALLBACKS[];
    private MethodInterceptor CGLIB$CALLBACK_0;
    private static Object CGLIB$CALLBACK_FILTER;
    private static final Method CGLIB$add$0$Method;
    private static final MethodProxy CGLIB$add$0$Proxy;
    private static final Object CGLIB$emptyArgs[];
    private static final Method CGLIB$delete$1$Method;
    private static final MethodProxy CGLIB$delete$1$Proxy;
    private static final Method CGLIB$equals$2$Method;
    private static final MethodProxy CGLIB$equals$2$Proxy;
    private static final Method CGLIB$toString$3$Method;
    private static final MethodProxy CGLIB$toString$3$Proxy;
    private static final Method CGLIB$hashCode$4$Method;
    private static final MethodProxy CGLIB$hashCode$4$Proxy;
    private static final Method CGLIB$clone$5$Method;
    private static final MethodProxy CGLIB$clone$5$Proxy;

    static 
    {
        CGLIB$STATICHOOK1();
    }

    public UserServiceImpl$$EnhancerByCGLIB$$e6a99d9a()
    {
        CGLIB$BIND_CALLBACKS(this);
    }
}
