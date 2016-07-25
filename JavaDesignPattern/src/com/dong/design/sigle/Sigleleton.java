package com.dong.design.sigle;

/*****
 * 单例模式:
 *   四个需求：
 *     1. 返回且返回唯一的对象。
 *     2. 在共享资源的时候，允许多线程并发
 *     3. 提升访问性能 ?????
 *     4. 懒加载，只有在使用的时候才会加载进来
 * @author dong
 * 注：如果在单例模式中实现序列化，代码看不懂，详情可见：http://blog.csdn.net/liguangzhenghi/article/details/8076361
 */
public class Sigleleton {
    
    private static Sigleleton sigleleton1 = null;
    
    /***
     * 最常见的单例模式，不能保证线程安全，多线程访问容易出现错误。
     * @return
     */
    public static Sigleleton getInstance1(){
        if(sigleleton1 == null){
            sigleleton1 = new Sigleleton();
        }
        return sigleleton1;
    }
    
    /****
     * 性能消耗上太大，除第一次外，每次都需要同步验证。线程安全
     * @return
     */
    public synchronized static Sigleleton getInstance2(){
        if(sigleleton1 == null){
            sigleleton1 = new Sigleleton();
        }
        return sigleleton1;
    }
    
    /***
     * 1和2的结合体，优化了1和2的缺陷，在线程安全和性能上做了中和。
     *    1. 没有在方法题上做同步，在性能上相对于2是一个提升。
     *    2. 判断后的同步可以避免多线程的并发操作出现的错误。
     * 看似很完美的，然而扔存在问题:
     * java代码最终的执行都是转换成汇编指令执行，在汇编的过程中让可能
     * 出现线程安全问题。加了同步，仍然会在一定程度上影响性能。
     * @return
     */
    public static Sigleleton getInstance3(){
        if(sigleleton1 == null){
            synchronized (Sigleleton.class) {
                if(sigleleton1 == null){
                    sigleleton1 = new Sigleleton();
                }
            }
        }
        return sigleleton1;
    }
    
    /***
     * 饿汉式的单例模式：
     * 优点：
     *   代码简单、线程安全、性能优越
     * 缺点：
     *   有局限性，涉及到实例初始化需要参数的时候不能用
     */
    private static Sigleleton sigleleton2 = new Sigleleton();
    
    public static Sigleleton getInstance4(){
        return sigleleton2;
    }
    
    /***
     * 优点：线程安全、性能优越、可以带参数
     * 缺点：代码麻烦。
     */
    private static class SigleletonHolder{
        static Sigleleton sigleleton = new Sigleleton();
    }
    
    public static Sigleleton getInstance5(){
        return SigleletonHolder.sigleleton;
    }

}
