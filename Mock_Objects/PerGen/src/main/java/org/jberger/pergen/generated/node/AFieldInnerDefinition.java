/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jberger.pergen.generated.node;

import org.jberger.pergen.generated.analysis.Analysis;

@SuppressWarnings("nls")
public final class AFieldInnerDefinition extends PInnerDefinition
{
    private PFieldDefinition _fieldDefinition_;

    public AFieldInnerDefinition()
    {
        // Constructor
    }

    public AFieldInnerDefinition(
        @SuppressWarnings("hiding") PFieldDefinition _fieldDefinition_)
    {
        // Constructor
        setFieldDefinition(_fieldDefinition_);

    }

    @Override
    public Object clone()
    {
        return new AFieldInnerDefinition(
            cloneNode(this._fieldDefinition_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFieldInnerDefinition(this);
    }

    public PFieldDefinition getFieldDefinition()
    {
        return this._fieldDefinition_;
    }

    public void setFieldDefinition(PFieldDefinition node)
    {
        if(this._fieldDefinition_ != null)
        {
            this._fieldDefinition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fieldDefinition_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fieldDefinition_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fieldDefinition_ == child)
        {
            this._fieldDefinition_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fieldDefinition_ == oldChild)
        {
            setFieldDefinition((PFieldDefinition) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
