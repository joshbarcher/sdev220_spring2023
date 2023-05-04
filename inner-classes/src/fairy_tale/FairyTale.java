package fairy_tale;

public class FairyTale
{
    public void tellStory()
    {
        Cinderella cinderella = new Cinderella();
        PrinceCharming prince = new PrinceCharming();
        FairyGodMother godMother = new FairyGodMother();

        cinderella.say("This slipper is too small!");
        prince.say("Let me help!");
        godMother.say("They lived happily ever after!");
    }

    private class Cinderella
    {
        public void say(String sentence)
        {
            System.out.println("Cinderella: " + sentence);
        }
    }

    private class FairyGodMother
    {
        public void say(String sentence)
        {
            System.out.println("Fairy God-Mother: Well, " + sentence);
        }
    }

    private class PrinceCharming
    {
        public void say(String sentence)
        {
            System.out.println("Prince Charming: Verily, " + sentence);
        }
    }
}
