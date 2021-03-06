package com.github.czyzby.lml.vis.parser.impl.tag.provider;

import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlTag;
import com.github.czyzby.lml.parser.tag.LmlTagProvider;
import com.github.czyzby.lml.vis.parser.impl.tag.MenuBarLmlTag;

/** Provides Vis menu bar tags.
 *
 * @author MJ */
public class MenuBarLmlTagProvider implements LmlTagProvider {
    @Override
    public LmlTag create(final LmlParser parser, final LmlTag parentTag, final String rawTagData) {
        return new MenuBarLmlTag(parser, parentTag, rawTagData);
    }
}
