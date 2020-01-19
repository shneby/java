package com.innerclass;

public class Layer1 {
    private String name = "layer1";

    public class Layer2 {
        private String name = "layer2";

        public class Layer3 {
            private String name = "layer3";

            public class Layer4{
                private String name = "layer4";
            }
        }
    }
    public static void main(String[] args) {

        Layer1 layer1 = new Layer1();
        Layer1.Layer2 layer2 = layer1.new Layer2();
        Layer1.Layer2.Layer3 layer3 = layer2.new Layer3();
        Layer1.Layer2.Layer3.Layer4 layer4 = layer3.new Layer4();

        System.out.println(layer1.name);
        System.out.println(layer2.name);
        System.out.println(layer3.name);
        System.out.println(layer4.name);
    }
}
