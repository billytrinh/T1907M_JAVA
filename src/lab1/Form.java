package lab1;

import javafx.scene.control.TextField;

public class Form {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();

    public void submitStudent() throws Exception{
        String name = txtName.getText();
        Integer age;
        Integer mark;
        try{
            age = Integer.parseInt(txtAge.getText());
            mark = Integer.parseInt(txtMark.getText());
        }catch (Exception e){
//            age = 18;
//            mark=0;
            // hoac la thong bao loi de dung chuong trinh
            throw new Exception("Loi mat roi"); // Crash app
        }

        Student s = new Student(name,age,mark);
        Main.students.add(s);

        // Show ra danh sach
        Main.students.stream().forEach(e->{
            System.out.println(e.getName()+"-"+e.getAge()+"-"+e.getMark());
        });
    }

}
