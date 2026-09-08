public class s3 {
    public static void main(String args[]){
    int a=3;
    int b=4;
    char op = '*';
    switch(op){
        case '+':
            System.out.println("Addition = "+ (a+b));
        break;
        case '-':
            System.out.println("subraction = "+ (a-b));
        break;
        case '*':
             System.out.println("multipication = "+(a*b));
             break;
        case '/':
            System.out.println("divition = "+(a/b));
            break;
        default :
        System.out.println("koi operator nhi hai ");

    }
}
}
