package model;

public class GameConsole
{
    private String type; //ps4, ps5, xbox series x, switch, ...
    private boolean discLess;
    private boolean slim;
    private int storageGigs;

    public GameConsole(String type, boolean discLess,
                       boolean slim, int storageGigs)
    {
        this.type = type;
        this.discLess = discLess;
        this.slim = slim;
        this.storageGigs = storageGigs;
    }

    @Override
    public boolean equals(Object obj)
    {
        //detect if the obj variable has an instance of GameConsole inside?
        if (!(obj instanceof GameConsole))
        {
            return false;
        }

        //convert Object variable to GameConsole variable
        GameConsole other = (GameConsole)obj;
        return type.equals(other.type);
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isDiscLess() {
        return discLess;
    }
    public void setDiscLess(boolean discLess) {
        this.discLess = discLess;
    }
    public boolean isSlim() {
        return slim;
    }
    public void setSlim(boolean slim) {
        this.slim = slim;
    }
    public int getStorageGigs() {
        return storageGigs;
    }
    public void setStorageGigs(int storageGigs) {
        this.storageGigs = storageGigs;
    }


    @Override
    public String toString()
    {
        return "GameConsole{" +
                "type='" + type + '\'' +
                ", discLess=" + discLess +
                ", slim=" + slim +
                ", storageGigs=" + storageGigs +
                '}';
    }
}
