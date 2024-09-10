package com.example.crud.domain.room;


import jakarta.persistence.*;
import lombok.*;

@Table(name="room")
@Entity(name="room")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Room {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private float height;
    private float width;
    private float depth;

    public static RoomBuilder getBuilder(){
        return new RoomBuilder();
    }

    public static class RoomBuilder {
        private final Room room = new Room();

        public RoomBuilder withId(String id){
            room.id = id;
            return this;
        }

        public RoomBuilder withHeight(float height){
            room.height = height;
            return this;
        }

        public RoomBuilder withWidth(float width){
            room.width = width;
            return this;
        }

        public RoomBuilder withDepth(float depth){
            room.depth = depth;
            return this;
        }

        public Room build(){
            return room;
        }
    }
}
