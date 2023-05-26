import org.testng.annotations.Test;

public class InMemoryStore {

    @Test
    public void inMemoryStoreSongs(){
        //Initial Capacity is 3 songs per user
        RecentlyPlayedStore store=new RecentlyPlayedStore(3);

        store.addSong("Song 1","User A");
        store.addSong("Song 2","User A");
        store.addSong("Song 3","User A");

        System.out.println("Song Playlist Looks like: "+store.getRecentlyPlayedSongs("User A"));

        store.addSong("Song 4","User A");
        System.out.println("When Song 4 is played: "+store.getRecentlyPlayedSongs("User A"));

        store.addSong("Song 2","User A");
        System.out.println("When Song 2 is played: "+store.getRecentlyPlayedSongs("User A"));

        store.addSong("Song 1","User A");
        System.out.println("When Song 1 is played: "+store.getRecentlyPlayedSongs("User A"));
    }
}
