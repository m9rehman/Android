import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime(){
        //Generate a Unique Id
        mId = UUID.randomUUID();
    }

    //Getter for UUID and G-S for Title


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId(){
        return mId;
    }
}
