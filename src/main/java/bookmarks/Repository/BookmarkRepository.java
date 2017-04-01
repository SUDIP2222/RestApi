package bookmarks.Repository;

import bookmarks.Model.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by sudip sarker on 4/2/2017.
 */
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> findByAccountUsername(String username);
}