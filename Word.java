package ColLesson02;

public class Word{
    public static void main( String[] args )
    {
        String japanese = null;

        Integer integer = new Integer( japanese );
        String integerString = integer.toString();
        System.out.println( integerString );

        String english = null;

        Integer integer2 = new Integer( english );
        System.out.println( english );


        HasNotToStringClass hasNot = new HasNotToStringClass();
        String hasNotString = hasNot.toString();
        System.out.println( hasNotString );

        HasToStringClass hasToString = new HasToStringClass();
        String hasToStringString = hasToString.toString();
        System.out.println( hasToStringString );

    }
		}
		class HasNotToStringClass
		{
		    private int japanese;
			public int i = japanese;
		}

		class HasToStringClass
		{
		    private int english;
			public int i = english;

		    public String toString()
		    {
		        return "HasToStringClass[i:" + i + "]";
		    }
		}

