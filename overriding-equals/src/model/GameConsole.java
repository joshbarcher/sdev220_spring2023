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
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameConsole that = (GameConsole) o;

        if (storageGigs != that.storageGigs) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + storageGigs;
        return result;
    }

    /*@Override
    public boolean equals(Object obj)
    {
        //detect if the obj variable has an instance of GameConsole inside?
        if (!(obj instanceof GameConsole))
        {
            return false;
        }

        //convert Object variable to GameConsole variable
        GameConsole other = (GameConsole)obj;
        return type.equals(other.type) && discLess == other.discLess;
    }*/

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
