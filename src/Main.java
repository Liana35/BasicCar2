public class Main {
    public static void main(String[] args) {
       BasicStruct audi= new BasicStruct();
       audi.color="black";
       audi.model="A3";
       audi.power="5000cc";

       Engine2 x= new Engine2();
       x.cylinders="8";
       x.size="1323hk";
       x.weight="3434kg";


       color2 col= new color2();
       col.colorLights="true";
       col.colorTyre="false";
       col.colorWindows="true";


       lightsFeature neon= new lightsFeature();
       neon.color="red";
       neon.size="15cm";
       neon.intensity="345345lumin";

    }
}