package nextstep.domain;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findAllByDeleted(boolean deleted, Pageable pageable);

    Iterable<Question> findByDeleted(boolean deleted);
}
