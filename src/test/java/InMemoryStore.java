public class InMemoryStore {

    public static void main(String[] args) {
        RecentlyPlayedStore store=new RecentlyPlayedStore(3);

        store.addSong("Song 1","User A");
        store.addSong("Song 2","User A");
        store.addSong("Song 3","User A");

        System.out.println(store.getRecentlyPlayedSongs("User A"));

        store.addSong("Song 4","User A");
        System.out.println(store.getRecentlyPlayedSongs("User A"));

        store.addSong("Song 2","User A");
        System.out.println(store.getRecentlyPlayedSongs("User A"));

        store.addSong("Song 1","User A");
        System.out.println(store.getRecentlyPlayedSongs("User A"));
    }
}
