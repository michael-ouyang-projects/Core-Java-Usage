package ouyang.oop;

public class Factory {

    public static abstract class Bot{
        private int Height;
        private int Width;
        private String CompanyName;
        
        public Bot(int height , int width , String companyname) {
            this.Height = height;
            this.Width = width;
            this.CompanyName = companyname;
        }
        
        public int GetHeight() {
            return Height;
        }
        
        public int GetWidth() {
            return Width;
        }
        
        public String GetCompanyName() {
            return CompanyName; 
        }
        
        public abstract void GetInfo();
        public abstract void DoWork(int m , int n);
    }
    
    public static class SweepFloor extends Bot{
        public SweepFloor(int height , int width , String companyname){
            super(height , width , companyname);
        }
        
        public void GetInfo() {
            System.out.printf("這是一台:掃地機器人 ， 高:%d , 寬度:%d , 由 %s 公司製造\n" , 
                    GetHeight() , GetWidth() , GetCompanyName());
        }
        public void DoWork(int m , int n) {
            int FreeBlock=(n-m)/2;
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    if(i < FreeBlock || i >= (n - FreeBlock) || 
                            j < FreeBlock || j >= (n - FreeBlock)) {
                        System.out.print("掃");
                    }
                    else {
                        System.out.print("貨");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public static class Delivery extends Bot{
        public Delivery(int height , int width , String companyname){
            super(height , width , companyname);
        }
        
        public void GetInfo() {
            System.out.printf("這是一台:送貨機器人 ， 高:%d , 寬度:%d , 由 %s 公司製造\n" , 
                    GetHeight() , GetWidth() , GetCompanyName());
        }
        public void DoWork(int m , int n) {
            int FreeBlock=(n-m)/2;
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    if(i < FreeBlock || i >= (n - FreeBlock) || 
                            j < FreeBlock || j >= (n - FreeBlock)) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("貨");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
