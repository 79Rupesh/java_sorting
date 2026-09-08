public class s5 {
    public static void main(String args[]){
        int month = 4;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
           
            System.out.println("31 ka month hai : "+month);
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" 30 ka month hai : "+month );
            break;

            case 2:
           System.out.println("28/29 ka month hai : "+ month );
           break;
            default:
                System.out.println(" koi month nhi hai : "+month );
    }    
}}
