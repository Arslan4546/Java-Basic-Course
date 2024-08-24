interface  A {

    void  Disp();
//    default  void  Inocent(){
    
//    } // java k purany version mai ye hota tha k jo bhi method interface mai aye ga uss ko child classes lazmi implement kryn gee but new version ye cheez eleminate kr dee hai or ab ap default sath lga k idhr kuch bhi add krskty hain or apko child classes mai implement krny ki koi zaroorat nhi hai 

}
interface  B extends  A {

    void  show();
}

class Arslan implements B {

           @Override
    public void show(){
        System.out.println("Implementing Both A and B Show");
    }
    @Override
    public void Disp(){
        System.out.println("Implementing Both A and B Disp");
    }
    
}
class  Main{

    public static void main(String[] args) {
       B a = new Arslan();
        a.show();
        a.Disp();
    }
}

// iss program mai A or B dono abstract classes hain but B A ko extends kr rhi hai or Arslan dono A or B k Methods ko Override kr rhi hai iss lyee hum reference B ka or object A ka Banyn Gy 