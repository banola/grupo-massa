package com.example.crud.domain.tile;

import jakarta.persistence.*;
import lombok.*;

@Table(name="tile")
@Entity(name="tile")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Tile {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private float height;
    private float width;
    private float gap;
    private float depth;

    public static TileBuilder getBuilder(){
       return new TileBuilder();
    }

    public static class TileBuilder {
        private final Tile tile = new Tile();

        public TileBuilder withId(String id){
            tile.id = id;
            return this;
        }

        public TileBuilder withHeight(float height){
            tile.height = height;
            return this;
        }

        public TileBuilder withWidth(float width){
            tile.width = width;
            return this;
        }

        public TileBuilder withGap(float gap){
            tile.gap = gap;
            return this;
        }

        public TileBuilder withDepth(float depth){
            tile.depth = depth;
            return this;
        }

        public Tile build(){
            return tile;
        }
    }
}
