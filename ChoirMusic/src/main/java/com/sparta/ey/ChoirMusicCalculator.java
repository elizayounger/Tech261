package com.sparta.ey;

import static com.sparta.ey.ChoirVoice.SOPRANO;
import static com.sparta.ey.ChoirVoice.ALTO;
import static com.sparta.ey.ChoirVoice.TENOR;
import static com.sparta.ey.ChoirVoice.BASS;
import static com.sparta.ey.ChoirVoice.*;

public class ChoirMusicCalculator {

    public static double calculateMusicPages(ChoirVoice voice, int pieces, int pagesPerPiece) {
        switch (voice) {
            case SOPRANO:
                return pieces * pagesPerPiece * 1.2; // Extra solos
            case ALTO:
                return pieces * pagesPerPiece * 1.0; // Standard pages
            case TENOR:
                return pieces * pagesPerPiece * 1.1; // Additional harmonies
            case BASS:
                return pieces * pagesPerPiece * 0.9; // Less complex parts
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        int pieces = 10;
        int pagesPerPiece = 5;

        double sopranoPages = calculateMusicPages(ChoirVoice.SOPRANO, pieces, pagesPerPiece);
        double altoPages = calculateMusicPages(ChoirVoice.ALTO, pieces, pagesPerPiece);
        double tenorPages = calculateMusicPages(ChoirVoice.TENOR, pieces, pagesPerPiece);
        double bassPages = calculateMusicPages(ChoirVoice.BASS, pieces, pagesPerPiece);

        System.out.println("Soprano requires " + sopranoPages + " pages of music.");
        System.out.println("Alto requires " + altoPages + " pages of music.");
        System.out.println("Tenor requires " + tenorPages + " pages of music.");
        System.out.println("Bass requires " + bassPages + " pages of music.");
    }
}
