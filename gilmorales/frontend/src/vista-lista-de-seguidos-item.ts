import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista-de-seguidos-item')
export class VistaListaDeSeguidosItem extends LitElement {
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
<vaadin-horizontal-layout class="content" style="justify-content: center; padding: 3px;" id="layoutItem" theme="spacing-s">
 <vaadin-vertical-layout id="vaadinVerticalLayout" style="align-self: center;">
  <vaadin-avatar id="vaadinAvatar" style="width: 60px; height: 60px;"></vaadin-avatar>
 </vaadin-vertical-layout>
 <vaadin-button theme="tertiary" id="nombreUsuario" style="align-self: center;">
   NombreUsuario 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
