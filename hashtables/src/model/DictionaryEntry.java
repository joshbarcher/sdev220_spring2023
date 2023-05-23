package model;

public class DictionaryEntry
{
    private String word;
    private String definition;

    public DictionaryEntry(String word, String definition)
    {
        this.word = word;
        this.definition = definition;
    }

    @Override
    public int hashCode()
    {
        int sum = 0;

        //add up the UNICODE values together
        for (int i = 0; i < word.length(); i++)
        {
            char letter = word.charAt(i);
            sum += letter;
        }

        return sum;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null || !other.getClass().equals(this.getClass()))
        {
            return false;
        }
        DictionaryEntry otherEntry = (DictionaryEntry)other;
        return otherEntry.word.equals(this.word);
    }

    public String getWord()
    {
        return word;
    }

    public String getDefinition()
    {
        return definition;
    }

    @Override
    public String toString()
    {
        return word;
    }
}
