package im.wait.lazywork.io;


import im.wait.lazywork.utils.StringUtils;

/**
 * User: mcxiaoke
 * Date: 14-3-25
 * Time: 15:55
 */
public class SafeFileNameGenerator implements NameGenerator {

    @Override
    public String generate(String key) {
        return StringUtils.toSafeFileName(key);
    }

}
