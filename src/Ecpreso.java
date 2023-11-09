public class Ecpreso {
    int cofe = 5;
    int water=150;
    void ecp(){
        System.out.println("Рецепт експресо: "+cofe+" г кави,"+water+" мл води.");
    }
    void test(){
        Capuchino ca =new Capuchino();
        ca.capu();
    }
    class Capuchino{
        int milk =450;
        void capu(){
            System.out.println("Рецепт капучіно:"+cofe+" г кави,"+water+" мл води,"+milk+" мл молоко.");
        }
    }
}
