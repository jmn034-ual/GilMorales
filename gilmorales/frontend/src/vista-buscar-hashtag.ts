import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-buscar-hashtag')
export class VistaBuscarHashtag extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="align-self: stretch; margin: var(--lumo-space-s); justify-content: center;" id="layoutBuscarHashtag">
 <vaadin-horizontal-layout id="layoutTituloHashtags" style="flex-grow: 1; justify-content: center; margin: var(--lumo-space-m); width: 100%;">
  <h3 id="tituloHashtags" style="flex-grow: 0; align-self: center;">Hashtags</h3>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutListaResultadoHashtags1" style="align-self: stretch;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
