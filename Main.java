import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Tom",2201);

        Course course0 = new Course(" Java  ",18502,"   Wu ",256);
        Course course1 = new Course("高等数学",14104,"   Lu ",167);
        Course course2 = new Course("大学物理",16107,"  Hong",212);
        Course course3 = new Course("离散数学",16107,"  Mei ",312);

        int flag;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请选择你要进行的操作：");
            System.out.println("1.选课");
            System.out.println("2.查看课表");
            System.out.println("0.退出程序");
            flag = scanner.nextInt();

            if (flag == 1) {
                System.out.println("------------------------------------");
                System.out.println("\t1:Java");
                System.out.println("\t2:高等数学");
                System.out.println("\t3:大学物理");
                System.out.println("\t4:离散数学");
                System.out.println("------------------------------------");
                System.out.println("请输入选择课程对应的代码：(输入0完成选课)");

                int choice = -1;
                while (choice != 0) {
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 0:
                            System.out.println("已完成选课！");
                            break;
                        case 1:
                            student.add(course0);
                            System.out.println("已选：" + course0.getName());
                            break;
                        case 2:
                            student.add(course1);
                            System.out.println("已选：" + course1.getName());
                            break;
                        case 3:
                            student.add(course2);
                            System.out.println("已选：" + course2.getName());
                            break;
                        case 4:
                            student.add(course3);
                            System.out.println("已选：" + course3.getName());
                            break;
                        default:
                            System.out.println("无效输入，请重新输入：");
                            break;
                    }
                }
            } else if (flag == 2) {
                System.out.println("以下是" + student.name + "（学号：" + student.id + "）已选择的课程：");
                System.out.println("--------------------------------------------");
                System.out.println("课程名称" + "\t\t" + "任课老师" + "\t\t" + "上课地点" + "\t\t" + "上课时间");
                for (Course course : student.getSelected()) {
                    System.out.println(course.getName() + "\t\t" + course.getTeacher() + "\t\t" + course.getPlace() + "\t\t" + course.getTime());
                }
                System.out.println("\t\t\t\t\t\t\t\t 共计" + student.selected.size() + "门课程");
                System.out.println("--------------------------------------------");
            } else if (flag==0) {
                break;
            }else {
                System.out.println("错误！请重新输入！");
            }
        }
    }
}