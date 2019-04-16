package rocks.zipcode.io.objectorientation;

public class Television {
    private Boolean isOn = false;
    private TVChannel channel;

    public void turnOn() {
        this.isOn = true;
        this.channel = TVChannel.MSN;
    }

    public void setChannel(Integer channel) throws IllegalStateException {
        if(!isOn){
            throw new IllegalStateException();
        }
        this.channel = TVChannel.getByOrdinal(channel);
    }

    public TVChannel getChannel() {
        return this.channel;
    }
}
