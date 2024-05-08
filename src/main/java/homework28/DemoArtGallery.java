package homework28;

public class DemoArtGallery {
    public static void main(String[] args) {
        Painting painting = new Painting("Malevitch", "Black square",PaintType.ACRYLIC, "15x15");
        Sculpture sculpture = new Sculpture("Michelangelo", "David", Material.MARBLE, 300);

        ArtGallery artGalleryManager = new ArtGallery();
        artGalleryManager.addArtwork(painting);
        artGalleryManager.addArtwork(sculpture);

        artGalleryManager.displayAllArtworks();

        artGalleryManager.removeArtwork(sculpture);
        artGalleryManager.displayAllArtworks();

    }
}
