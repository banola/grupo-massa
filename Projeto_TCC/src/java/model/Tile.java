/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pedro
 */
public class Tile {
    private double height;
    private double lenght;
    private double thickness;
    private double gap;
    private double loss_perc;
    
    public Tile(){
        height = 0;
        lenght = 0;
        thickness = 0;
        gap = 0;
        loss_perc = 0.1;
    }
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public double getGap() {
        return gap;
    }

    public void setGap(double gap) {
        this.gap = gap;
    }

    public double getLoss_perc() {
        return loss_perc;
    }

    public void setLoss_perc(double loss_perc) {
        this.loss_perc = loss_perc;
    }
    
    public static TileBuilder getBuilder(){
        return new TileBuilder();
    }
    
    public static class TileBuilder{
        private Tile tile = new Tile();
        
        public TileBuilder withLenght(double lenght){
            tile.lenght = lenght;
            return this;
        }
        
        public TileBuilder withHeight(double height){
            tile.height = height;
            return this;
        }
        
        public TileBuilder withGap(double gap){
            tile.gap = gap;
            return this;
        }
        
        public TileBuilder withThickness(double thickness){
            tile.thickness = thickness;
            return this;
        }
        
        public TileBuilder withLoss_perc(double lp){
            tile.loss_perc = lp;
            return this;
        }
        
        public Tile Build(){
            return tile;
        }
    }
}
