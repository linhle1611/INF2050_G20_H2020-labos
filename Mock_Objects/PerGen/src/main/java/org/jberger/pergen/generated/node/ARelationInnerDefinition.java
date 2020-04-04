/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jberger.pergen.generated.node;

import org.jberger.pergen.generated.analysis.Analysis;

@SuppressWarnings("nls")
public final class ARelationInnerDefinition extends PInnerDefinition
{
    private PRelationDefinition _relationDefinition_;

    public ARelationInnerDefinition()
    {
        // Constructor
    }

    public ARelationInnerDefinition(
        @SuppressWarnings("hiding") PRelationDefinition _relationDefinition_)
    {
        // Constructor
        setRelationDefinition(_relationDefinition_);

    }

    @Override
    public Object clone()
    {
        return new ARelationInnerDefinition(
            cloneNode(this._relationDefinition_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARelationInnerDefinition(this);
    }

    public PRelationDefinition getRelationDefinition()
    {
        return this._relationDefinition_;
    }

    public void setRelationDefinition(PRelationDefinition node)
    {
        if(this._relationDefinition_ != null)
        {
            this._relationDefinition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._relationDefinition_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._relationDefinition_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._relationDefinition_ == child)
        {
            this._relationDefinition_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._relationDefinition_ == oldChild)
        {
            setRelationDefinition((PRelationDefinition) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
