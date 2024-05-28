class Guest implements Observer {
    private String name;

    public Guest(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " -> " + message);
        
        
    }
}