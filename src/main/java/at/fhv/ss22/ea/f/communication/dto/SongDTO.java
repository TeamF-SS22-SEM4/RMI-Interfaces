package at.fhv.ss22.ea.f.communication.dto;

public class SongDTO {
    private String title;
    private String duration;

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public static Builder builder() {
        return new Builder();
    }

    private SongDTO() {}

    public static class Builder {
        private SongDTO instance;

        public Builder() {
            this.instance = new SongDTO();
        }

        public Builder withTitle(String title) {
            this.instance.title = title;
            return this;
        }

        public Builder withDuration(String duration) {
            this.instance.duration = duration;
            return this;
        }

        public SongDTO build() {
            return this.instance;
        }
    }
}
