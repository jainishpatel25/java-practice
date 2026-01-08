package interfaceexample;

interface Animal{
    void sound();

    void king();
}

class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("dog barks");
    }

    public void king(){
        System.out.println("lion is king");
    }
}
