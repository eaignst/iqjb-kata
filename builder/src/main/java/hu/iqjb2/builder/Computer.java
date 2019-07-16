/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.builder;

/**
 *
 * @author avincze
 */
public class Computer {

    private Memory memory;
    private Processor processor;
    private Display display;
    private Hdd hdd;

    public static class Builder {

        private Memory memory;
        private Processor processor;
        private Display display;
        private Hdd hdd;
        
        public Builder memory(Memory memory){
            this.memory = memory;
            return this;
        }
        
        public Builder processor(Processor processor){
            this.processor = processor;
            return this;
        }
        
        public Builder hdd(Hdd hdd){
            this.hdd = hdd;
            return this;
        }
        
        public Builder display(Display display){
            this.display = display;
            return this;
        }
        
        public Computer build(){
            return new Computer(this);
        }
        
    }

    private Computer(Builder builder) {
        this.display = builder.display;
        this.hdd = builder.hdd;
        this.memory = builder.memory;
        this.processor = builder.processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer[" + memory + ", " + processor + ", " + display + ", " + hdd + ']';
    }

    
}
