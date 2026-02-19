package inner_interface;

public class Button {
    private String label;
    private ClickListener clickListener;


    public interface ClickListener{
        void onClick(Button button);
        void onDoubleClick(Button button);
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    private void handleClick(){
        if (clickListener != null){
            clickListener.onClick(this);
        }
    }
}
