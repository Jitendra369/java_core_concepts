package inner_interface;

public class LoginForm {

    public void setUpUi(){
        Button button = new Button();

        button.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick(Button button) {

            }

            @Override
            public void onDoubleClick(Button button) {

            }
        });
    }
}
