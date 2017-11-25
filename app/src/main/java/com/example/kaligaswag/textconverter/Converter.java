package com.example.kaligaswag.textconverter;

/**
 * Created by Kaligaswag on 25/11/2017.
 */

public class Converter {

    private String input;
    private String output;

    public String smalltext(String input){
        output = input.toLowerCase()
                .replaceAll("[a]", "ᵃ")
                .replaceAll("[b]", "ᵇ")
                .replaceAll("[c]", "ᶜ")
                .replaceAll("[d]", "ᵈ")
                .replaceAll("[e]", "ᵉ")
                .replaceAll("[f]", "ᶠ")
                .replaceAll("[g]", "ᵍ")
                .replaceAll("[h]", "ʰ")
                .replaceAll("[i]", "ᶦ")
                .replaceAll("[j]", "ʲ")
                .replaceAll("[k]", "ᵏ")
                .replaceAll("[l]", "ᶫ")
                .replaceAll("[m]", "ᵐ")
                .replaceAll("[n]", "ᶰ")
                .replaceAll("[o]", "ᵒ")
                .replaceAll("[p]", "ᵖ")
                .replaceAll("[q]", "ᵒ")
                .replaceAll("[r]", "ʳ")
                .replaceAll("[s]", "ˢ")
                .replaceAll("[t]", "ᵗ")
                .replaceAll("[u]", "ᵘ")
                .replaceAll("[v]", "ᵛ")
                .replaceAll("[w]", "ʷ")
                .replaceAll("[x]", "ˣ")
                .replaceAll("[y]", "ʸ")
                .replaceAll("[z]", "ᶻ");
        return output;
    }

}
