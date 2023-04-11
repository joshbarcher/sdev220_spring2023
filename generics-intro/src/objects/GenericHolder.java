package objects;

public class GenericHolder<T>
{
    private T data;

    public GenericHolder(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }
}
