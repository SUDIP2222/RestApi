package bookmarks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookmarksApplication {

	public static void main(String[] args) {

		SpringApplication.run(BookmarksApplication.class, args);

		/*@Bean
		CommandLineRunner init(AccountRepository accountRepository, BookmarkRepository bookmarkRepository) {
			return (evt) -> Arrays.asList(
					"jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
					.forEach(
							a -> {
								Account account = accountRepository.save(new Account(a, "password"));
								bookmarkRepository.save(new Bookmark(account,
										"http://bookmark.com/1/" + a, "A description"));
								bookmarkRepository.save(new Bookmark(account,
										"http://bookmark.com/2/" + a, "A description"));
							});
		}*/

	}
}
