public class App {
    public static void main(String[] args) throws Exception {
        
        SinglyLinkedList playlist = new SinglyLinkedList();
        playlist.addSong("Killer Queen", 210);
        playlist.addSong("After Hours", 180);
        playlist.addSong("Love me Again", 240);

        System.out.println("Playlist:");
        playlist.printList();

        System.out.println("Total Duration: " + playlist.getTotalDuration() + "s");

        playlist.removeSong("After Hours");
        System.out.println(" Playlist Actualizada:");
        playlist.printList();

        System.out.println("Total Duration: " + playlist.getTotalDuration() + "s");
    }
}
