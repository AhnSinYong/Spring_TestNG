package org.ahn;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015-11-25.
 */
@Service
public class RandomEmailGenerator implements EmailGenerator {

    @Override
    public String generate() {
        return "feedback@yoursite.com";
    }
}
