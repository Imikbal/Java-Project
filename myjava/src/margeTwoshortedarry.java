class margeTwoshortedarry {
    public static void main(String[] args) {
        System.out.println("WELCOME TO SHORTED ARRY");
        int[] numarry1=Arrayutility.inputarry();
        int[] numarry2=Arrayutility.inputarry();
        int[] margeTwoshorted=marge(numarry1,numarry2);
        Arrayutility.display(margeTwoshorted);

    }
    public static int[] marge ( int[] numarry1,int[] numarry2) {
        int size= numarry1.length + numarry2.length;
        int[] newarry=new int[size];
        int i = 0, j = 0, k = 0;
        while(i< numarry1.length ||j< numarry2.length){
            if (j== numarry2.length ||
                    (i< numarry1.length && numarry1[i]<numarry2[j])){
                newarry[k]=numarry1[i];
                i++;
                k++;
            }else {
                newarry[k]=numarry2[j];
                j++;
                k++;
            }
        }return newarry;
    }
}
