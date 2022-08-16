import java.util.Scanner;

public class H_Burc_Bulan_Program {
    public static void main(String[] args) {

        int month, day;
        Scanner scan = new Scanner(System.in);

        System.out.print("Dogdunuz Ay :");
        month = scan.nextInt();

        System.out.print("Dogdunuz Gun :");
        day = scan.nextInt();

        switch (month) {

            case 1:
                if (day >= 1 && day <= 31) {

                    if (day < 22) {
                        System.out.print("Oglak burcu");
                    } else {
                        System.out.println("Kova burcu");
                    }
                } else {
                    System.out.println("Hatali bir gun girdiniz");
                }
                break;

            case 2:
                if (day >= 1 && day <= 31) {
                    if (day < 20) {
                        System.out.print("Kova burcu");
                    } else {
                        System.out.println("Balik burcu");
                    }
                } else {
                    System.out.println("Hatali bir gun girdiniz");
                }
                break;

            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        System.out.print("Balik burcu");
                    } else {
                        System.out.println("Koc burcu");
                    }
                } else {
                    System.out.println("Hatali bir gun girdiniz");
                }

                break;

            case 4:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        System.out.println("Koc burcu");
                    } else {
                        System.out.println("Boga burcu");
                    }
                } else {
                    System.out.println("Hatali bir gun girdiniz");
                }
                break;

            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Boga burcu");
                    } else {
                        System.out.println("Ikizler burcu");
                    }
                } else {
                    System.out.println("Hatali bir gun girdiniz");
                }
                break;

            case 6:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Ikızler burcu");
                    } else {
                        System.out.println("Yengec burcu");
                    }
                } else {
                    System.out.println("Hatali bir gun girdiniz");
                }
                break;

            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Yengec burcu");
                    } else {
                        System.out.println("Aslan burcu");
                    }
                } else {
                    System.out.println("Hatali bir gun girdiniz");
                }
                break;

            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Aslan burcu");
                    } else {
                        System.out.println("Basak burcu");
                    }
                } else {
                    System.out.println("Hatali bir gun girdiniz");
                }
                break;

            case 9:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Basak burcu");
                    } else {
                        System.out.println("Terazi burcu");
                    }
                } else {
                    System.out.println("Hatali bir gun girdiniz");
                }
                break;

            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Terazi burcu");
                    } else {
                        System.out.println("Akrep burcu");
                    }
                } else {
                    System.out.println("Hatali bir gun girdiniz");
                }
                break;

            case 11:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Akrep burcu");
                    } else {
                        System.out.println("Yay burcu");
                    }
                } else {
                    System.out.println("Hatali bir gun girdiniz");
                }
                break;

            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Yay burcu");
                    } else {
                        System.out.println("Oglak burcu");
                    }
                } else {
                    System.out.println("Hatali bir gun girdiniz");
                }
                break;
            default:
                System.out.println("Hatali bir ay girdiniz");
        }
    }
}
